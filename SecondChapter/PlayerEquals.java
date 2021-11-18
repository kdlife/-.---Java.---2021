package SecondChapter;

import java.util.Objects;

public class PlayerEquals { // тут  все как обычно до класс плауер с геттерами и сеттерами. До Оверрайда. 
	private int id;
	private String name;
	
	public PlayerEquals(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId () {
		return id;
	}
	public String getName() {
		return name;
	}
	public void  setId (int id) {
		this.id=id;
	}
	public void setName (String name) {
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {// переопредиляем метотд equals 
		if(this==obj) {return true;}// если обьекты равыно то труе
		if(obj==null) {return false;}// если обьет нулл то фалсе
		if(getClass()!=obj.getClass()) {return false;}//Метод getClass позволяет получить тип данного объекта
		final PlayerEquals other=(PlayerEquals) obj;
		if(this.id!=other.id) {return false;}// тут проверемем значения обьектов 
		if(!Objects.equals(this.name, other.name)) {return false;}
		return true;
		}
	
	 @Override//переопредиляем метотд hashCode()
	    public int hashCode() {
	        int hash = 7;
	        hash = 79 * hash + this.id;
	        hash = 79 * hash + Objects.hashCode(this.name);
	        return hash;
	    }
	}
