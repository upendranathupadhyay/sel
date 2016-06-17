FluentWait<WebDriver> waitf=new FluentWait<WebDriver>(driver).withTimeout(1,TimeUnit.SECONDS).pollingEvery(100, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		
		WebElement ModifySearch=waitf.until(new Function<WebDriver,WebElement>()
				{
			     public WebElement apply(WebDriver diver)
			     {
			    	 WebElement modifysearch=diver.findElement(By.xpath(".//*[@class='pull-rightmodify_search_toggle ng-scope')"));
			    	 return modifysearch;
			     }
				}