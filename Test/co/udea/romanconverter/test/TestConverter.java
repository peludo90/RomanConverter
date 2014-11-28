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
	
	@Test
	public void convertTen(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(10);
		
		assertEquals("X",intConverted);	
	}
	
	@Test
	public void convert33(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(33);
		
		assertEquals("XXXIII",intConverted);	
	}
	
	
	@Test
	public void convert99(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(99);
		
		assertEquals("XCIX",intConverted);	
	}
	
	@Test
	public void convert50(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(50);
		
		assertEquals("L",intConverted);	
	}
	
	
	@Test
	public void convert100(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(100);
		
		assertEquals("C",intConverted);	
	}
	
	@Test
	public void convert1000(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(1000);
		
		assertEquals("M",intConverted);	
	}
	
	@Test
	public void convert1853(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(1853);
		
		assertEquals("MDCCCLIII",intConverted);	
	}
	
	
	@Test
	public void convert3999(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(3999);
		
		assertEquals("MMMCMXCIX",intConverted);	
	}
	
	@Test
	public void convert4000(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(4000);
		
		assertEquals(null,intConverted);	
	}
	
	@Test
	public void convertMinusOne(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(-1);
		
		assertEquals(null,intConverted);	
	}
	
	@Test
	public void convertZero(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(0);
		
		assertEquals(null,intConverted);	
	}
	
	@Test
	public void convert801(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(801);
		
		assertEquals("DCCCI",intConverted);	
	}
	
	@Test
	public void convert451(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(451);
		
		assertEquals("CDLI",intConverted);	
	}
	
	@Test
	public void convert500(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(500);
		
		assertEquals("D",intConverted);	
	}

	@Test
	public void convert600(){
		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(600);
		
		assertEquals("DC",intConverted);	
	}

	@Test
	public void convert599(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(599);
		
		assertEquals("DXCIX",intConverted);	
	}
	

	@Test
	public void convert702(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(702);
		
		assertEquals("DCCII",intConverted);	
	}
	
	@Test
	public void convert800(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(800);
		
		assertEquals("DCCC",intConverted);	
	}
	
	@Test
	public void convert80(){

		Converter converter = new Converter();
		
		String intConverted = converter.toRoman(80);
		
		assertEquals("LXXX",intConverted);	
	}
	
}
