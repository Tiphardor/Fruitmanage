package org.fruitmanage.util;

import org.fruitmanage.entity.Fruit;

public class AlterFruit {
	public static Fruit JudgeFruitParams(Fruit fruit,String fruitName,Integer seasonId,Float fruitPrice,String uploadImageFileName){
		if(fruitName != null && !(fruitName.equals("")) && !(fruit.getFruitName().equals(fruitName))){
			fruit.setFruitName(fruitName);
		}
		if(seasonId != null && !(seasonId.equals("")) && !(fruit.getSeasonId().equals(seasonId))){
			fruit.setSeasonId(seasonId);
		}
		if(fruitPrice != null && !(fruitPrice.equals("")) && !(fruit.getFruitPrice().equals(fruitPrice))){
			fruit.setFruitPrice(fruitPrice);
		}
		if(uploadImageFileName != null && !(uploadImageFileName.equals("")) && !(fruit.getImageUrl().equals(uploadImageFileName))){
			fruit.setImageUrl(uploadImageFileName);
		}
		return fruit;
	}
}
