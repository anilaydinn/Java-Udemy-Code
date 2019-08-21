package com.anilaydin.paket1;

import com.anilaydin.paket2.*;

public class Main {

	/*
	 	Access Modifiers - Erişim Belirleyiciler
	 	
	 	Erişim Belirleyiciler 2 düzeyde erişimi belirlerler.
	 	
	 	Sınıf Düzeyinde Erişim Belirleyiciler
	 	
	 	public : Bir class eğer public yazılmışsa bu classa paketin içindei ve paketin dışındaki tüm classlar tarafından erişilir.
	 	
	 	default : default erişim belirleyici kullanmamak anlamına gelir.
	 	Eğer bir class hiçbir erişim belirleyici kullanmadan yazılmışsa, bu class'a sadece aynı paketin içindeki classlar erişebilir.
	 	Paketin dışındaki classlar bu class'a erişemez.
	 	
	 	*** protected, private erişim belirleyiciler classlar için kullanılamazlar.
	 	
	 	Metod ve Özellik Düzeyinde Erişim Belirleyiciler
	 	
	 	public : Eğer bir metod veta özellik(class member veya alan) public olarak tanımlanmışsa, bu alana paketin içindeki ve dışındaki
	 	tüm classlar erişebilir.
	 	Ancak tabii ki bu alanın içinde bulunduğu classın da erişilebilir olması gerekir.
	 	
	 	default : Eğer bir metod veya özellik tanımlanırken hiçbir erişim belirleyici kullanılmamışsa (default), bu alana sadece kendi paketindeki
	 	classlar erişebilir.
	 	
	 	protected : Eğer bir metod veya özellik(class member veya alan) protected olarak tanımlanmışsa, bu alana aynı paketin içindeki diğer
	 	classlar tarafından erişilebilir. Paketin dışındaki classlar ise sadece bu alanın bulunduğu classın bir alt classıysa erişeibilir.
	 	
	 	private : Eğer bir alan private olarak tanımlanmışsa bu alana sadece kendi classı erişebilir.
	 	
	 	Daha önceden öğrendiğimiz gibi bir metodun içinde tanımlanmış değişkenler lokal değişken olarak tanmlanırlar. Yani bu değişkenlere
	 	diğer metodlardan ve classlardan erişilemez. Bundan dolayı bu değişkenlere access modifier eklenmez.
	 	
	 */
	
	
	public static void main(String[] args) {
		
		
		//Hayvan hayvan = new Hayvan("Hayvan");
		//System.out.println(hayvan.isim);
		
		At at = new At("Cacık");
		at.ismini_soyle();
	}
	
}
