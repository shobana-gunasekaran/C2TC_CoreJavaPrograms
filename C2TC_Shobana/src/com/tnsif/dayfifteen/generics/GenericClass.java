package com.tnsif.dayfifteen.generics;
//Program to demonstrate user defined generic class
//Generic Class
class GenericClass<T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}
}