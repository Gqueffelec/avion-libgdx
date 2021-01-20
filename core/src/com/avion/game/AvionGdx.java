package com.avion.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AvionGdx extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private float x;
	private float y;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("shuttlenoweps.png");
	}

	@Override
	public void render() {
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y += 4;
		}
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			y -= 4;
		}
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			x -= 4;
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x += 4;
		}
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}

}
