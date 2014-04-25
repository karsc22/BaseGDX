package com.kargames.basegdx.screen;

import com.kargames.basegdx.App;
import com.kargames.basegdx.widget.FillTable;

public class GameScreen extends BaseScreen {

	public GameScreen(App app) {
		super(app);
		
		FillTable table = new FillTable();
		table.setSkin(app.skin);
		table.add("<Insert gameplay here>");
		stage.addActor(table);
	}

}
