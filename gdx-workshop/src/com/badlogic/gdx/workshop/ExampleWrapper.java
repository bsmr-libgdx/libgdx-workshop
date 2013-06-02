package com.badlogic.gdx.workshop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.workshop.audio.BetterPcmExample;
import com.badlogic.gdx.workshop.audio.MusicExample;
import com.badlogic.gdx.workshop.audio.PcmExample;

/**
 * Instantiates an {@link ApplicationListener} in the {@link #create()} method. Set
 * in all starter classes. Just modify the create method to quickly test an example
 * on all platforms. 
 * @author badlogic
 *
 */
public class ExampleWrapper implements ApplicationListener {
	private ApplicationListener listener;
	
	@Override
	public void create() {
		listener = new BetterPcmExample();
		listener.create();
	}

	@Override
	public void resize(int width, int height) {
		listener.resize(width, height);
	}

	@Override
	public void render() {
		listener.render();
	}

	@Override
	public void pause() {
		listener.pause();
	}

	@Override
	public void resume() {
		listener.resume();
	}

	@Override
	public void dispose() {
		listener.dispose();
	}
}
