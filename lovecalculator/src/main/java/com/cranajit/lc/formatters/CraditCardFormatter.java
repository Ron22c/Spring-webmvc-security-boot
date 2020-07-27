package com.cranajit.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.cranajit.lc.dtos.CraditCard;

public class CraditCardFormatter implements Formatter<CraditCard>{
	
	@Override
	public String print(CraditCard card, Locale locale) {
		return card.getFirst()+"-"+card.getSecond()+"-"+card.getThird()+"-"+card.getForth();
	}

	@Override
	public CraditCard parse(String text, Locale locale) throws ParseException {
		String[] fullNumber = text.split("-");
		return new CraditCard(fullNumber[0], fullNumber[1], fullNumber[2], fullNumber[3]);
	}

}
