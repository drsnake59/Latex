float note = 12.52;
if(note >= 0 && note < 8) {
	System.out.println("Aie ! J'ai mal !");
}
else if(note >= 8 && note < 10) {
	System.out.println("Un petit effort");
}
else if(note >= 10 && note < 12) {
	System.out.println("Admis");
}
else if(note >= 12 && note < 14) {
	System.out.println("Admis mention assez bien !");
}
else if(note >= 14 && note < 16) {
	System.out.println("Admis mention bien !");
}
else if(note >= 16 && note <= 20) {
	System.out.println("Admis mention tres bien !");
}
else {
	System.out.println("ERREUR: La note doit etre comprise entre 0 et 20 !");
}
