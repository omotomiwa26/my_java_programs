package com.aide.trainer.mylibgdxgame;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.*;
import java.util.*;

public class MyGdxGame implements ApplicationListener
{
	int ROCK_DISTANCE = 600;

	OrthographicCamera camera;
    Animation walkAnimation;
	TextureRegion backgroundTexture;
	TextureRegion rockTexture;
	Sound collisionSound;
	BitmapFont font;
    SpriteBatch batch;

    float time;
	Rectangle manPosition;
	Vector2 manVelocity;
	
	List<Rectangle> rockPositions;

    @Override
    public void create()
	{
		Texture texture = new Texture(Gdx.files.internal("skyBackground.jpg"));
		backgroundTexture = new TextureRegion(texture, 0, 0, 2048, 563);

		Texture texture2 = new Texture(Gdx.files.internal("rock.png"));
		rockTexture = new TextureRegion(texture2, 25, 0, 250, 250);
		rockPositions = new ArrayList<Rectangle>();
		int x = 1800;
		for (int i = 0; i < 60; i++)
		{
			rockPositions.add(new Rectangle(x, 0, 100, 100));
			x += ROCK_DISTANCE + new Random().nextInt(600);
		}
		
        Texture walkSheet = new Texture(Gdx.files.internal("runAnimation.png"));
		int FRAME_COLS = 6;
		int FRAME_ROWS = 5;
        TextureRegion[][] tmp = TextureRegion.split(walkSheet, walkSheet.getWidth() / FRAME_COLS, walkSheet.getHeight() / FRAME_ROWS);
        TextureRegion[] walkFrames = new TextureRegion[FRAME_COLS * FRAME_ROWS];
        int index = 0;
        for (int i = 0; i < FRAME_ROWS; i++)
		{
            for (int j = 0; j < FRAME_COLS; j++)
			{
                walkFrames[index++] = tmp[i][j];
            }
        }
        walkAnimation = new Animation(0.025f, walkFrames);

		font = new BitmapFont();
		
		collisionSound = Gdx.audio.newSound(Gdx.files.internal("collision.wav"));
		
        batch = new SpriteBatch();
		camera = new OrthographicCamera();
		resetGame();
    }

    @Override
    public void render()
	{
		Gdx.gl.glClearColor(0.9f, 0.9f, 0.9f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

		camera.update();
		batch.setProjectionMatrix(camera.combined);
        batch.begin();
		
		for (int i = 0; i < 30; i++)
			batch.draw(backgroundTexture, i * 2900, 0, 2900, 800);
		
		for (Rectangle r : rockPositions)
			batch.draw(rockTexture, r.x, r.y, r.width, r.height);
			
        batch.draw(walkAnimation.getKeyFrame(time, true), manPosition.x, manPosition.y, manPosition.width, manPosition.height);
		
		font.draw(batch, (int) (manPosition.x / 70) + "m", camera.position.x - 10, 30);
        batch.end();

		if (Gdx.input.isTouched() || Gdx.input.isKeyPressed(Input.Keys.BUTTON_A) || Gdx.input.isKeyPressed(Input.Keys.DPAD_CENTER))
			if (manPosition.y == 0)
				manVelocity.y = 500;
		
		time += Gdx.graphics.getDeltaTime();
		manPosition.x += manVelocity.x * Gdx.graphics.getDeltaTime();
		manPosition.y += manVelocity.y * Gdx.graphics.getDeltaTime();
		manVelocity.y -= 1000 * Gdx.graphics.getDeltaTime();
		if (manPosition.y < 0) 
		{
			manPosition.y = 0;
			manVelocity.y = 0;
		}

		camera.translate((manVelocity.x - camera.viewportWidth / 80) * Gdx.graphics.getDeltaTime(), 0);
		
		for (Rectangle r : rockPositions)
			if (r.overlaps(manPosition) && r.getCenter(new Vector2()).dst(manPosition.getCenter(new Vector2())) < 120)
			{
				collisionSound.play();
				resetGame();
				break;
			}
    }
	
	private void resetGame()
	{
		configureCamera();
		manPosition = new Rectangle(0, 0, 200, 200);
		manVelocity = new Vector2(500, 0);
	}

	private void configureCamera()
	{
		if (Gdx.graphics.getHeight() < Gdx.graphics.getWidth())
			camera.setToOrtho(false, 800, 800 * Gdx.graphics.getHeight() / Gdx.graphics.getWidth());
		else
			camera.setToOrtho(false, 800 * Gdx.graphics.getWidth() / Gdx.graphics.getHeight(), 800);
	}

	@Override
    public void dispose()
	{
        batch.dispose();
    }

    @Override
    public void resize(int width, int height)
	{
		resetGame();
    }

    @Override
    public void pause()
	{
    }

    @Override
    public void resume()
	{
    }
}