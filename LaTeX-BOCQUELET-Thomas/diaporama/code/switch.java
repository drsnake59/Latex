float note = 12.52;
switch(note) {
	case 0:
		System.out.println("Aie ! J'ai mal !");
		break;
	case 8:
		System.out.println("Un petit effort !");
		break;
	case 10:
		System.out.println("Admis");
		break;
	case 12:
		System.out.println("Admis mention assez bien");
		break;
	case 14:
		System.out.println("Admis mention bien");
		break;
	case 16:
		System.out.println("Admis mention tres bien");
		break;
	default:
		System.out.println("ERREUR: La note doit etre comprise entre 0 et 20 !");
}
