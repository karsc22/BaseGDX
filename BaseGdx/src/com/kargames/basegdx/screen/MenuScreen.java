package com.kargames.basegdx.screen;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.kargames.basegdx.App;
import com.kargames.basegdx.widget.BackButton;
import com.kargames.basegdx.widget.FillTable;
import com.kargames.basegdx.widget.ScreenButton;

public class MenuScreen extends BaseScreen {

	public MenuScreen(final App app) {
		super(app);
		FillTable table = new FillTable();
		table.defaults().pad(5);
		table.add(new Label("Game Title", app.skin)).row();

		ScreenButton playButton = new ScreenButton(app, "Play", app.screens.gameScreen);
		ScreenButton optionsButton = new ScreenButton(app, "Options", app.screens.optionsScreen);
		ScreenButton controlsButton = new ScreenButton(app, "Controls", app.screens.controlScreen);
		
		TextButton exitButton = new BackButton(app, "Exit");

		table.add(playButton).row();
		table.add(optionsButton).row();
		table.add(controlsButton).row();
		table.add(exitButton).row();
		
		stage.addActor(table);
	}

}
