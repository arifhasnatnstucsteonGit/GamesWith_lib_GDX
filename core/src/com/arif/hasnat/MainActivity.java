package com.arif.hasnat;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainActivity extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Music audioBG;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("bird8.jpg");



		// Load Sound
		audioBG = Gdx.audio.newMusic(Gdx.files.internal("background.mp3"));

		// start the playback of the background music immediately
		audioBG.setLooping(true);
		// Play
		audioBG.play();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
