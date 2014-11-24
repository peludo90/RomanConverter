package co.udea.romanconverter.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.udea.romarconverter.entity.Converter;

public class TestConverter {

	@Test
	public void convertOne() {
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(1);
		
		assertEquals("I",intConverted);	
	}

	
	@Test
	public void convertFive() {
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(5);
		
		assertEquals("V",intConverted);	
	}
	
	@Test
	public void convertFour() {
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(4);
		
		assertEquals("IV",intConverted);	
	}
	
	
	
	@Test
	public void convertSeven() {
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(7);
		
		assertEquals("VII",intConverted);	
	}
		
	@Test
	public void convertNine() {
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(9);
		
		assertEquals("IX",intConverted);	
	}
}
