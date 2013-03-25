public class StartGame extends Activity
	{
		private var screenWelcome:Welcome; //when the game loads this will be the start or welcome screem
		private var screenInGame:inGame; //calling the in game class
		private var bg:Image; //background image to display the start game button
		
		public function StartGame() 
		{
			
			this.addEventListener();
			
		}
		
		private function WelcomeScreen(e:Event):void
		{
			
			this.addEventListener(NavigationEvent.CHANGE_SCREEN, onChangeScreen); //
			
			screenInGame = new inGame();
			screenInGame.disposeTemporarily(); // back and forth between menu
			this.addChild(screenInGame);
			
			screenWelcome = new Welcome();
			this.addChild(screenWelcome);
			screenWelcome.initialize();
			//screenWelcome.addEventListener(TouchEvent.TOUCH, onTouchedScreen);
		}
		
		private function onChangeSCreen(event:NavigationEvent):void
		{
			switch(event.params.id)
			{
				case "play":
					screenWelcome.disposeTemporarily();
					screenInGame.initialize();
					break;
				case "home":
					screenInGame.disposeTemporarily();
					screenWelcome.initialize();
					break;
			}
			
		}
	
			
	
	}
		
}