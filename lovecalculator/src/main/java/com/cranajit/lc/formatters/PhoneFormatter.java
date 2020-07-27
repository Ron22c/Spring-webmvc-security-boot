package com.cranajit.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.cranajit.lc.dtos.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		return phone.getCountryCode() + "-" + phone.getNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		if (text != null) {
			if (text.indexOf('-') == -1) return new Phone("91", text);
			if (text.indexOf('-') == 0) return new Phone("91", text.split("-")[1]);
			String[] fullNumber = text.split("-");
			return new Phone(fullNumber[0], fullNumber[1]);
		}
		return null;
	}

}
