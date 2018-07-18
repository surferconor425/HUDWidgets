package co.uk.silvania.hudwidgets;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.config.Configuration;
import co.uk.silvania.hudwidgets.client.GuiWidgetBase;
import net.minecraftforge.fml.common.FMLLog;

public class HUDWidgetsConfig {
	
	public static File hudConfig;
	
	public static void init(String configpath) {
		hudConfig = new File(configpath + "HUDWidgetsConfig.cfg");
		
		HUDWidgetsConfig.initConfig(hudConfig);
	}
	
	public static Configuration config;
	
	public static final String CATEGORY_AAA_INTRO = "a config intro";
	public static final String CATEGORY_HEALTH = "health bar";
	public static final String CATEGORY_HUNGER = "hunger bar";
	public static final String CATEGORY_EXP = "experience bar";
	public static final String CATEGORY_ARMOUR = "armour bar";
	public static final String CATEGORY_OXYGEN = "oxygen bar";
	public static final String CATEGORY_TIME = "server time widget";
	public static final String CATEGORY_NAME = "name widget";
	public static final String CATEGORY_GAMEMODE = "gamemode widget";
	public static final String CATEGORY_COMPASS = "compass widget";
	public static final String CATEGORY_WALLET = "wallet widget";
	public static final String CATEGORY_FPS = "fps widget";
	public static final String CATEGORY_HORSEJUMP = "horse jump bar";
	public static final String CATEGORY_HORSEHEALTH = "horse health bar";
	public static final String CATEGORY_HOTBAR = "inventory hotbar";
	public static final String CATEGORY_POTION = "potion dock";
	public static final String CATEGORY_ITEMDOCK = "item counter widget";
	public static final String CATEGORY_NOTIFICATION = "notification window";
	public static final String CATEGORY_MOTD = "message of the day";
	
	public static int nameplateDistance;
	public static int nameplateDistanceSneaking;
	public static boolean forceServer;
	public static boolean useServer;
	
	public static int healthXOffset;
	public static int healthYOffset;
	public static int healthAnchor;
	public static int healthTextColour;
	public static String healthTextureStyle;
	public static boolean healthEnabled;
	public static boolean saoColouredHealth;
	public static boolean renderHealthCreative;
	public static boolean healthText;
	
	public static int hungerXOffset;
	public static int hungerYOffset;
	public static int hungerAnchor;
	public static int hungerTextColour;
	public static String hungerTextureStyle;
	public static boolean hungerEnabled;
	public static boolean renderHungerCreative;
	public static boolean hungerText;

	public static int expXOffset;
	public static int expYOffset;
	public static int expAnchor;
	public static int expTextColour;
	public static String expTextureStyle;
	public static boolean expEnabled;
	public static boolean renderExpCreative;
	public static boolean expText;
	
	public static int armourXOffset;
	public static int armourYOffset; 
	public static int armourBarStyle;
	public static int armourAnchor;
	public static int armourTextColour;
	public static String armourTextureStyle;
	public static boolean armourEnabled;
	public static boolean alwaysRenderArmour;
	public static boolean renderArmourCreative;
	public static boolean armourText;
	
	public static int oxygenXOffset; 
	public static int oxygenYOffset;
	public static int oxygenBarStyle;
	public static int oxygenAnchor;
	public static int oxygenTextColour;
	public static String oxygenTextureStyle;
	public static boolean oxygenEnabled;
	public static boolean alwaysRenderOxygen;
	public static boolean renderOxygenCreative;
	public static boolean oxygenText;
	
	public static int timeXOffset;
	public static int timeYOffset;
	public static int timeStyle;
	public static int timeAnchor;
	public static int timeTextColour;
	public static String timeTextureStyle;
	public static boolean timeEnabled;
	public static boolean renderTimeCreative;
	
	public static int nameXOffset;
	public static int nameYOffset;
	public static int nameAnchor;
	public static int nameTextColour;
	public static String nameTextureStyle;
	public static boolean nameRelativeResize;
	public static boolean nameTextAlignRight;
	public static boolean nameEnabled;
	public static boolean renderNameCreative;

	public static int gamemodeXOffset;
	public static int gamemodeYOffset;
	public static int gamemodeAnchor;
	public static int gamemodeSTextColour;
	public static int gamemodeCTextColour;
	public static int gamemodeATextColour;
	public static String gamemodeTextureStyle;
	public static boolean gamemodeRelativeResize;
	public static boolean gamemodeTextAlignRight;
	public static boolean gamemodeEnabled;
	
	public static int compassXOffset;
	public static int compassYOffset;
	public static int compassAnchor;
	public static int compassNColour;
	public static int compassEColour;
	public static int compassSColour;
	public static int compassWColour;
	public static int compassPointsColour;
	public static String compassTextureStyle;
	public static boolean compassEnabled;
	public static boolean textCompass;
	public static boolean renderCompassCreative;
	
	public static int walletXOffset;
	public static int walletYOffset;
	public static int walletAnchor;
	public static int walletTextColour;
	public static String walletTextureStyle;
	public static boolean walletEnabled;
	public static boolean renderWalletCreative;
	
	public static int fpsXOffset;
	public static int fpsYOffset;
	public static int fpsAnchor;
	public static int fpsTextColour;
	public static String fpsTextureStyle;
	public static boolean fpsEnabled;
	public static boolean renderFPSCreative;
	
	public static int horseJumpBarXOffset;
	public static int horseJumpBarYOffset;
	public static int horseJumpBarAnchor;
	public static String horseJumpBarTextureStyle;
	public static boolean horseJumpBarEnabled;
	public static boolean alwaysRenderHorseJumpBar;
	public static boolean horizontalHorseJumpBar;
	public static boolean renderHorseJumpBarCreative;
	
	public static int horseHealthXOffset;
	public static int horseHealthYOffset;
	public static int horseHealthAnchor;
	public static int horseHealthTextColour;
	public static String horseHealthTextureStyle;
	public static boolean horseHealthEnabled;
	public static boolean alwaysRenderHorseHealth;
	public static boolean renderHorseHealthCreative;
	public static boolean textHorseHealth;
	
	public static int hotbarXOffset;
	public static int hotbarYOffset;
	public static int hotbarAnchor;
	public static String hotbarTextureStyle;
	public static boolean hotbarEnabled;
	public static boolean horizontalHotbar;
	
	public static int potionDockXOffset;
	public static int potionDockYOffset;
	public static int potionDockAnchor;
	public static int maxPotionsPerRow;
	public static String potionDockTextureStyle;
	public static boolean potionDockEnabled;
	public static boolean renderPotionDockCreative;
	
	public static int notificationWindowXSize;
	public static int notificationWindowYSize;
	public static int notificationWindowXOffset;
	public static int notificationWindowYOffset;
	public static int notificationWindowAnchor;
	public static int notificationWindowTransparancy;
	public static String notificationwindowTextureStyle;
	public static boolean notifcationWindowEnabled;
	public static boolean showDeathNotifcations;
	public static boolean showDeathOtherNotifications;
	public static boolean showKillNotifications;
	public static boolean showKillOtherNotifications;
	public static boolean showCollectItemNotifications;
	public static boolean showLevelUpNotifications;
	public static boolean showShopTransactionNotifications;
	public static boolean showMoneyTransactionNotifications;
	
	public static int motdYSize;
	public static int motdXOffset;
	public static int motdYOffset;
	public static int motdAnchor;
	public static String motdTextureStyle;
	public static boolean motdEnabled;
	public static int motdColour1;
	public static int motdColour2;
	public static int motdColour3;
	public static int motdColour4;
	public static int motdColour5;
	public static String motdMessage1;
	public static String motdMessage2;
	public static String motdMessage3;
	public static String motdMessage4;
	public static String motdMessage5;
	
	public static void initConfig (File configFile) {
		config = new Configuration(configFile);
		syncConfig();
	}
	
	public static void syncConfig() {	
		config.addCustomCategoryComment(CATEGORY_AAA_INTRO, 
				"Welcome to the hell that is configuring my GUI mod!" + "\n"
		+ "I wouldn't recommend tackling this without knowing what you are doing!" + "\n"
		+ "These comments will guide you as best I can, good luck!" + "\n" + "\n"
		
		+ "OK, the very first thing to do for each widget is decide if you actually want it. Find the enable option, and set to true or false." + "\n"
		+ "Next, decide on positioning; you have two options here - Anchor or X/Y, and both will give different results." + "\n"
		+ "Anchor is more stable, and better for lightweight users. You choose a corner/center of the screen, and your widget will be placed there." + "\n"
		+ "You can then use offset to move widgets around localized to the anchor." + "\n"
		+ "Option two is to use X/Y - This lets you place widgets ANYWHERE on the screen, but the gap between the widgets increases with scale." + "\n"
		+ "However, you can choose the same X/Y for multiple widgets, then move some away with offset- and the gap between those widgets would be static." + "\n"
		+ "You can get some pretty cool GUI styles by mixing Anchor and X/Y."
		+ "To select your mode, simply set the 'Anchor' value. 0 or 9+ will disable it and use X/Y, other numbers will anchor it as follows:" + "\n"
		+ "1 = Top Left, 2 = Top Centre, 3 = Top Right, 4 = Mid Left, 5 = Mid Right, 6 = Bottom Left, 7 = Bottom Centre, 8 = Bottom Right" + "\n" + "\n"
		
		+ "The next step is decide on your widgets styling. This will vary depending on the widget, but you can choose things like text colour," + "\n"
		+ "the texture file, and if/when to render it. I'll cover those in a bit more detail:" + "\n"
		+ "Text: Text is an option, and decides whether to render text (For example, a health bar could overlay 'Health 20/20'." + "\n"
		+ "Text Colour: This is the colour of the above text in a hex value. For reference 0xFFFFFF is white." + "\n"
		+ "Texture Style: Specify the texture path here. Default options are vanilla, rpg and dark. You can add more through a resource pack; simply specify the name here." + "\n"
		+ "Enabled: Specify whether the widget should render at all. Setting to false will remove the widget from the game entirely." + "\n"
		+ "Render in creative: Whether it should render in creative mode. Some people may want to disable this for things like Health." + "\n"
		+ "Any other options will be specified in the sections description." + "\n" + "\n"
					
		+ "That's all the generic stuff I'm afraid. Everything else I'll cover in comments in the relevant sections." + "\n" + "\n"
		
		+ "Oh, and for your own reference, as far as this config is concerned the Game Window is " + GuiWidgetBase.defaultWidth + "x" + GuiWidgetBase.defaultHeight + ". Widget sizes will be given in their description below." + "\n"
		+ "##NOTE## If you downloaded this as part of a modpack, those values may be incorrect, as they are only printed on the first run." + "\n"
		+ "Your game won't read them, so don't worry about it; they are only here for your reference. If you need them, recreate this config file." + "\n" + "\n"
		
		+ "Finally, there is a few global configs; Nameplate Render, Nameplate Render Sneak, Force Server and Use Server. The number is the distance" + "\n" + "\n"
		+ "For the nameplates, the number is the distance that player nameplates will render from." + "\n" + "\n"
		
		+ "Force Server is server-side only, it lets a server override your config file." + "\n"
		+ "Use Server is client side only. If the server has force server to off, you can choose to use their config at your own will." + "\n"
		+ "It's worth noting that the nameplate stuff is always forced.");
		
		nameplateDistance = config.get(CATEGORY_AAA_INTRO, "The distance a player's nameplate is rendered.", 64).getInt();
		nameplateDistanceSneaking = config.get(CATEGORY_AAA_INTRO, "The distance a sneaking player's nameplate is rendered.", 32).getInt();
		forceServer = config.get(CATEGORY_AAA_INTRO, "SERVER ONLY: Force clients to use this config.", false).getBoolean(false);
		useServer = config.get(CATEGORY_AAA_INTRO, "CLIENT ONLY: Use the server config, if optional.", true).getBoolean(true);
		
		
		config.addCustomCategoryComment(CATEGORY_HEALTH, "All health bar related options. Health Bar size is 204 x 20");
		healthXOffset = config.get(CATEGORY_HEALTH, "Health Bar X-Offset", 0).getInt();
		healthYOffset = config.get(CATEGORY_HEALTH, "Health Bar Y-Offset", 21).getInt();
		healthAnchor = config.get(CATEGORY_HEALTH, "Health Anchor", 1).getInt();
		healthTextColour = config.get(CATEGORY_HEALTH, "Health Bar Text Colour", 0xFFFFFF).getInt();
		healthTextureStyle = config.get(CATEGORY_HEALTH, "Health Texture Style", "staticons.png").getString();
		healthEnabled = config.get(CATEGORY_HEALTH, "Show the health bar", true).getBoolean(true);
		saoColouredHealth = config.get(CATEGORY_HEALTH, "SAO-style coloured health", false).getBoolean(false);
		renderHealthCreative = config.get(CATEGORY_HEALTH, "Show health bar in creative", true).getBoolean(true);
		healthText = config.get(CATEGORY_HEALTH, "Display text with the current health value", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_HUNGER, "All hunger bar related options. Hunger bar size is 204 x 20");
		hungerXOffset = config.get(CATEGORY_HUNGER, "Hunger Bar X-Offset", 0).getInt();
		hungerYOffset = config.get(CATEGORY_HUNGER, "Hunger Bar Y-Offset", 42).getInt();
		hungerAnchor = config.get(CATEGORY_HUNGER, "Hunger Anchor", 1).getInt();
		hungerTextColour = config.get(CATEGORY_HUNGER, "Hunger Bar Text Colour", 0xFFFFFF).getInt();
		hungerTextureStyle = config.get(CATEGORY_HUNGER, "Hunger Texture Style", "gui_stats_dark.png").getString();
		hungerEnabled = config.get(CATEGORY_HUNGER, "Show the hunger bar", true).getBoolean(true);
		renderHungerCreative = config.get(CATEGORY_HUNGER, "Show hunger bar in creative", true).getBoolean(true);
		hungerText = config.get(CATEGORY_HUNGER, "Display text with the current hunger value", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_EXP, "All EXP bar related options. EXP bar size is 204 x 20");
		expXOffset = config.get(CATEGORY_EXP, "EXP Bar X-Offset", 0).getInt();
		expYOffset = config.get(CATEGORY_EXP, "EXP Bar Y-Offset", 63).getInt();
		expAnchor = config.get(CATEGORY_EXP, "EXP Anchor", 1).getInt();
		expTextColour = config.get(CATEGORY_EXP, "EXP Text Colour", 0xFFFFFF).getInt();
		expTextureStyle = config.get(CATEGORY_EXP, "EXP Texture Style", "gui_stats_dark.png").getString();
		expEnabled = config.get(CATEGORY_EXP, "Show the EXP bar", true).getBoolean(true);
		renderExpCreative = config.get(CATEGORY_EXP, "Show EXP bar in creative", true).getBoolean(true);
		expText = config.get(CATEGORY_EXP, "Show EXP text (Level is always shown)", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_ARMOUR, "Always render armour shows it when you have none, but NOT in creative." + "\n"
		+ "Render in creative shows it in creative, if you are wearing armour." + "\n"
		+ "Setting both to true will ALWAYS render it, even in creative with no armour on." + "\n"
		+ "Style: 0 = standard, 1 = short, 2 = Render over health." + "\n"
		+ "Armor Style 0 is 204 x 20, Style 1 is 158 x 40");
		armourXOffset = config.get(CATEGORY_ARMOUR, "Armour Bar X-Offset", 0).getInt();
		armourYOffset = config.get(CATEGORY_ARMOUR, "Armour Bar Y-Offset", 84).getInt();
		armourBarStyle = config.get(CATEGORY_ARMOUR, "Armour Bar Style", 1).getInt();
		armourAnchor = config.get(CATEGORY_ARMOUR, "Armour Anchor", 1).getInt();
		armourTextColour = config.get(CATEGORY_ARMOUR, "Armour Bar Text Colour", 0xFFFFFF).getInt();
		armourTextureStyle = config.get(CATEGORY_ARMOUR, "Armour Texture Style", "gui_stats_dark2.png").getString();
		armourEnabled = config.get(CATEGORY_ARMOUR, "Armour Enabled", true).getBoolean(true);
		alwaysRenderArmour = config.get(CATEGORY_ARMOUR, "Always Render Armour, even when you aren't wearing any.", false).getBoolean(false);
		renderArmourCreative = config.get(CATEGORY_ARMOUR, "Render armour in Creative mode", true).getBoolean(true);
		armourText = config.get(CATEGORY_ARMOUR, "Show Armour Text", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_OXYGEN, "For help with render and bar style options, see Armour comments." + "\n"
		+ "If Bar Style for Oxygen and Armour are both 2, Oxygen will render OVER the Armour one.");
		oxygenXOffset = config.get(CATEGORY_OXYGEN, "Oxygen X-Offset", 125).getInt();
		oxygenYOffset = config.get(CATEGORY_OXYGEN, "Oxygen Y-Offset", 84).getInt();
		oxygenAnchor = config.get(CATEGORY_OXYGEN, "Oxygen Anchor", 1).getInt();
		oxygenTextColour = config.get(CATEGORY_OXYGEN, "Oxygen Text Colour", 0xFFFFFF).getInt();
		oxygenBarStyle = config.get(CATEGORY_OXYGEN, "Oxygen Bar Style", 1).getInt();
		oxygenTextureStyle = config.get(CATEGORY_OXYGEN, "Oxygen Texture Style", "gui_stats_dark2.png").getString();
		oxygenEnabled = config.get(CATEGORY_OXYGEN, "Oxygen Enabled", true).getBoolean(true);
		alwaysRenderOxygen = config.get(CATEGORY_OXYGEN, "Always render Oxygen", false).getBoolean(false);
		renderOxygenCreative = config.get(CATEGORY_OXYGEN, "Render Oxygen in Creative mode", true).getBoolean(true);
		oxygenText = config.get(CATEGORY_OXYGEN, "Show Oxygen Text", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_TIME, "Time Style switches between a (0) 12 hour clock, (1) 24 hour clock or (2) analog clock."); 
		timeXOffset = config.get(CATEGORY_TIME, "Time X-Offset", 84).getInt();
		timeYOffset = config.get(CATEGORY_TIME, "Time Y-Offset", 84).getInt();
		timeStyle = config.get(CATEGORY_TIME, "Time Style", 0).getInt();
		timeAnchor = config.get(CATEGORY_TIME, "Time Anchor", 1).getInt();
		timeTextColour = config.get(CATEGORY_TIME, "Time Text Colour", 0xFFFFFF).getInt();
		timeTextureStyle = config.get(CATEGORY_TIME, "Time Texture Style", "gui_stats_dark2.png").getString();
		timeEnabled = config.get(CATEGORY_TIME, "Display Time", true).getBoolean(true);
		renderTimeCreative = config.get(CATEGORY_TIME, "Render Time Creative", true).getBoolean(true);
		
		nameXOffset = config.get(CATEGORY_NAME, "Name X-Offset", 0).getInt();
		nameYOffset = config.get(CATEGORY_NAME, "Name Y-Offset", 0).getInt();
		nameAnchor = config.get(CATEGORY_NAME, "Name Anchor", 1).getInt();
		nameTextColour = config.get(CATEGORY_NAME, "Name Colour", 0xFFC700).getInt();
		nameTextureStyle = config.get(CATEGORY_NAME, "Name Texture Style", "gui_stats_dark2.png").getString();
		nameRelativeResize = config.get(CATEGORY_NAME, "Name Dynamic Resizing", false).getBoolean(false);
		nameTextAlignRight = config.get(CATEGORY_NAME, "Align Name Text right", false).getBoolean(false);
		nameEnabled = config.get(CATEGORY_NAME, "Display Player Name", true).getBoolean(true);
		renderNameCreative = config.get(CATEGORY_NAME, "Render Name Creative", true).getBoolean(true);
		
		gamemodeXOffset = config.get(CATEGORY_GAMEMODE, "Gamemode X-Offset", 125).getInt();
		gamemodeYOffset = config.get(CATEGORY_GAMEMODE, "Gamemode Y-Offset", 0).getInt();
		gamemodeAnchor = config.get(CATEGORY_GAMEMODE, "Gamemode Anchor", 1).getInt();
		gamemodeSTextColour = config.get(CATEGORY_GAMEMODE, "Gamemode Survival Colour", 0x0094FF).getInt();
		gamemodeCTextColour = config.get(CATEGORY_GAMEMODE, "Gamemode Creative Colour", 0xFFC700).getInt();
		gamemodeATextColour = config.get(CATEGORY_GAMEMODE, "Gamemode Adventure Colour", 0x007F0E).getInt();
		gamemodeTextureStyle = config.get(CATEGORY_GAMEMODE, "Gamemode Texture Style", "gui_stats_dark2.png").getString();
		gamemodeRelativeResize = config.get(CATEGORY_GAMEMODE, "Gamemode Dynamic Resizing", false).getBoolean(false);
		gamemodeTextAlignRight = config.get(CATEGORY_GAMEMODE, "Align Gamemode Text right", true).getBoolean(true);
		gamemodeEnabled = config.get(CATEGORY_GAMEMODE, "Display Gamemode", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_COMPASS, "Compass String colours are Minecraft format codes, NOT hex values!");
		compassXOffset = config.get(CATEGORY_COMPASS, "Compass X-Offset", 84).getInt();
		compassYOffset = config.get(CATEGORY_COMPASS, "Compass Y-Offset", 0).getInt();
		compassAnchor = config.get(CATEGORY_COMPASS, "Compass Anchor", 1).getInt();
		//compassNColour = config.get(CATEGORY_COMPASS, "Compass North Text Colour", 4).getInt();
		//compassEColour = config.get(CATEGORY_COMPASS, "Compass East Text Colour", 0).getInt();
		//compassSColour = config.get(CATEGORY_COMPASS, "Compass South Text Colour", 1).getInt();
		//compassWColour = config.get(CATEGORY_COMPASS, "Compass West Text Colour", 0).getInt();
		//compassPointsColour = config.get(CATEGORY_COMPASS, "Compass Points Text Colour", 0).getInt();
		compassTextureStyle = config.get(CATEGORY_COMPASS, "Compass Texture Style", "gui_stats_dark2.png").getString();
		compassEnabled = config.get(CATEGORY_COMPASS, "Display Compass", true).getBoolean(true);
		textCompass = config.get(CATEGORY_COMPASS, "Text-Based Compass", true).getBoolean(true);
		renderCompassCreative = config.get(CATEGORY_COMPASS, "Render Compass Creative", true).getBoolean(true);
		
		walletXOffset = config.get(CATEGORY_WALLET, "Wallet X-Offset", 206).getInt();
		walletYOffset = config.get(CATEGORY_WALLET, "Wallet Y-Offset", 0).getInt();
		walletAnchor = config.get(CATEGORY_WALLET, "Wallet Anchor", 1).getInt();
		walletTextColour = config.get(CATEGORY_WALLET, "Wallet Text Colour", 0xFFC700).getInt();
		walletTextureStyle = config.get(CATEGORY_WALLET, "Wallet Texture Style", "gui_stats_dark2.png").getString();
		walletEnabled = config.get(CATEGORY_WALLET, "Display FlenixCities Wallet", true).getBoolean(true);
		renderWalletCreative = config.get(CATEGORY_WALLET, "Render Wallet Creative", true).getBoolean(true);
		
		fpsXOffset = config.get(CATEGORY_FPS, "FPS X-Offset", 206).getInt();
		fpsYOffset = config.get(CATEGORY_FPS, "FPS Y-Offset", 21).getInt();
		fpsAnchor = config.get(CATEGORY_FPS, "FPS Anchor", 1).getInt();
		fpsTextColour = config.get(CATEGORY_FPS, "FPS Text Colour", 0xFFFFFF).getInt();
		fpsTextureStyle = config.get(CATEGORY_FPS, "FPS Texture Style", "gui_stats_dark2.png").getString();
		fpsEnabled = config.get(CATEGORY_FPS, "Display FPS", true).getBoolean(true);
		renderFPSCreative = config.get(CATEGORY_FPS, "Render FPS Creative", true).getBoolean(true);
		
		config.addCustomCategoryComment(CATEGORY_HORSEJUMP, "If setting vertical render to false, make sure you change texture style from verticalbars to horizontalbars!");
		horseJumpBarXOffset = config.get(CATEGORY_HORSEJUMP, "Horse Jump Bar X-Offset", 0).getInt();
		horseJumpBarYOffset = config.get(CATEGORY_HORSEJUMP, "Horse Jump Bar Y-Offset", 0).getInt();
		horseJumpBarAnchor = config.get(CATEGORY_HORSEJUMP, "Horse Jump Bar Anchor", 4).getInt();
		horseJumpBarTextureStyle = config.get(CATEGORY_HORSEJUMP, "Horse Jump Bar Texture Style", "gui_stats_dark_verticalbars.png").getString();
		horseJumpBarEnabled = config.get(CATEGORY_HORSEJUMP, "Display Horse Jump Bar", true).getBoolean(true);
		alwaysRenderHorseJumpBar = config.get(CATEGORY_HORSEJUMP, "Always Render Horse Jump Bar", false).getBoolean(false);
		horizontalHorseJumpBar = config.get(CATEGORY_HORSEJUMP, "Render Horse Jump Bar Vertically", false).getBoolean(false);
		renderHorseJumpBarCreative = config.get(CATEGORY_HORSEJUMP, "Render Horse Jump Bar Creative", true).getBoolean(true);
		
		horseHealthXOffset = config.get(CATEGORY_HORSEHEALTH, "Horse Health X-Offset", 0).getInt();
		horseHealthYOffset = config.get(CATEGORY_HORSEHEALTH, "Horse Health Y-Offset", 0).getInt();
		horseHealthAnchor = config.get(CATEGORY_HORSEHEALTH, "Horse Health Anchor", 3).getInt();
		horseHealthTextColour = config.get(CATEGORY_HORSEHEALTH, "Horse Health Text Colour", 0xFFFFFF).getInt();
		horseHealthTextureStyle = config.get(CATEGORY_HORSEHEALTH, "Horse Health Texture Style", "gui_stats_dark.png").getString();
		horseHealthEnabled = config.get(CATEGORY_HORSEHEALTH, "Display Horse Health", true).getBoolean(true);
		alwaysRenderHorseHealth = config.get(CATEGORY_HORSEHEALTH, "Always Render Horse Health", false).getBoolean(false);
		renderHorseHealthCreative = config.get(CATEGORY_HORSEHEALTH, "Render Horse Health Creative", true).getBoolean(true);
		textHorseHealth = config.get(CATEGORY_HORSEHEALTH, "Horse Health Text", true).getBoolean(true);
		
		hotbarXOffset = config.get(CATEGORY_HOTBAR, "Hotbar X-Offset", 0).getInt();
		hotbarYOffset = config.get(CATEGORY_HOTBAR, "Hotbar Y-Offset", 0).getInt();
		hotbarAnchor = config.get(CATEGORY_HOTBAR, "Hotbar Anchor", 7).getInt();
		hotbarTextureStyle = config.get(CATEGORY_HOTBAR, "Hotbar Texture Style", "gui_stats_dark.png").getString();
		hotbarEnabled = config.get(CATEGORY_HOTBAR, "Display the Hotbar", true).getBoolean(true);
		horizontalHotbar = config.get(CATEGORY_HOTBAR, "Horizontal Hotbar", true).getBoolean(true);
		
		potionDockXOffset = config.get(CATEGORY_POTION, "Potion X-Offset", 0).getInt();
		potionDockYOffset = config.get(CATEGORY_POTION, "Potion Y-Offset", 0).getInt();
		potionDockAnchor = config.get(CATEGORY_POTION, "Potion Anchor", 0).getInt();
		maxPotionsPerRow = config.get(CATEGORY_POTION, "Maximum Potions per row", 0).getInt();
		potionDockTextureStyle = config.get(CATEGORY_POTION, "Potion Dock Texture Style", "gui_stats_dark.png").getString();
		potionDockEnabled = config.get(CATEGORY_POTION, "Potion Dock Enabled", true).getBoolean(true);
		
		notificationWindowXSize = config.get(CATEGORY_NOTIFICATION, "Notification Window X-Size", 0).getInt();
		notificationWindowYSize = config.get(CATEGORY_NOTIFICATION, "Notification Window Y-Size", 0).getInt();
		notificationWindowXOffset = config.get(CATEGORY_NOTIFICATION, "Notification X-Offset", 0).getInt();
		notificationWindowYOffset = config.get(CATEGORY_NOTIFICATION, "Notification Y-OFfset", 0).getInt();
		notificationWindowAnchor = config.get(CATEGORY_NOTIFICATION, "Notification Anchor", 0).getInt();
		notificationWindowTransparancy = config.get(CATEGORY_NOTIFICATION, "Transparancy of Notification Window", 0).getInt();
		notificationwindowTextureStyle = config.get(CATEGORY_NOTIFICATION, "Notification Window Texture Style", "gui_stats_dark.png").getString();
		notifcationWindowEnabled = config.get(CATEGORY_NOTIFICATION, "Enable Notification Window", true).getBoolean(true);
		showDeathNotifcations = config.get(CATEGORY_NOTIFICATION, "Notify Your Deaths", true).getBoolean(true);
		showDeathOtherNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Other Players Deaths", true).getBoolean(true);
		showKillNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Your kills", true).getBoolean(true);
		showKillOtherNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Other Players Kills", true).getBoolean(true);
		showCollectItemNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Collect Items", true).getBoolean(true);
		showLevelUpNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Level Up", true).getBoolean(true);
		showShopTransactionNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Shop Transactions", true).getBoolean(true);
		showMoneyTransactionNotifications = config.get(CATEGORY_NOTIFICATION, "Notify Money Transactions", true).getBoolean(true);
		
		motdYSize = config.get(CATEGORY_MOTD, "MOTD Length", 260).getInt();
		motdXOffset = config.get(CATEGORY_MOTD, "MOTD X-Offset", 0).getInt();
		motdYOffset = config.get(CATEGORY_MOTD, "MOTD Y-Offset", 0).getInt();
		motdAnchor = config.get(CATEGORY_MOTD, "MOTD Anchor", 0).getInt();
		motdTextureStyle = config.get(CATEGORY_MOTD, "MOTD Bar Texture Style", "gui_stats_dark.png").getString();
		motdEnabled = config.get(CATEGORY_MOTD, "Enable MOTD", true).getBoolean(true);
		motdColour1 = config.get(CATEGORY_MOTD, "MOTD 1 Colour", 0xFFFFFF).getInt();
		motdColour2 = config.get(CATEGORY_MOTD, "MOTD 2 Colour", 0xFFFFFF).getInt();
		motdColour3 = config.get(CATEGORY_MOTD, "MOTD 3 Colour", 0xFFFFFF).getInt();
		motdColour4 = config.get(CATEGORY_MOTD, "MOTD 4 Colour", 0xFFFFFF).getInt();
		motdColour5 = config.get(CATEGORY_MOTD, "MOTD 5 Colour", 0xFFFFFF).getInt();
		motdMessage1 = config.get(CATEGORY_MOTD, "MOTD 1", "There is an option to set a Message of the Day in the config!").getString();
		motdMessage2 = config.get(CATEGORY_MOTD, "MOTD 2", "").getString();
		motdMessage3 = config.get(CATEGORY_MOTD, "MOTD 3", "").getString();
		motdMessage4 = config.get(CATEGORY_MOTD, "MOTD 4", "").getString();
		motdMessage5 = config.get(CATEGORY_MOTD, "MOTD 5", "").getString();

		if (config.hasChanged()) {
			config.save();
		}
	}

}
