package com.kargames.basegdx.screen;

import com.kargames.basegdx.App;
import com.kargames.basegdx.widget.FillTable;

public class CreditsScreen extends BaseScreen{

	public CreditsScreen(App app) {
		super(app);
		FillTable table = new FillTable();
		table.setSkin(app.skin);
		
	}
}
