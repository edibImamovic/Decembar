public class Datum {

	private int dan;
	private int mjesec;
	private int godina;

	public Datum(int dan, int mjesec, int godina) {

		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}

	public Datum(Datum other) {

		this.dan = other.dan;
		this.mjesec = other.mjesec;
		this.godina = other.godina;

	}

	public String toString() {

		String ispisString = dan + "." + mjesec + "." + godina;

		return ispisString;
	}

	/**
	 * 
	 * @return Vraca vrijednost varijable dan!
	 */

	public int getDan() {
		return dan;

	}

	/**
	 * 
	 * @return Vraca vrijednost varijable mjesec!
	 */
	public int getMjesec() {
		return mjesec;

	}

	/**
	 * 
	 * @return Vraca vrijednost varijable godina
	 */
	public int getGodina() {
		return godina;

	}

	public void setDan(int dan) {
		if (dan < 0 || dan > 31) {
			throw new IllegalArgumentException("Dan nije u validnom intervalu");
		} else {
			this.dan = dan;
		}

	}

	public void setMjesec(int mjesec) {
		if (mjesec < 1 || mjesec > 12) {
			throw new IllegalArgumentException(
					"Mjesec nije u validnom intervalu");
		} else {
			this.mjesec = mjesec;
		}

	}

	/**
	 * 
	 * @param novaGodina
	 *            , setuj vrijednost varijable godina!
	 */
	public void setGodina(int godina) {
		if (godina < 1900 || godina > 3014) {
			throw new IllegalArgumentException(
					"Godina nije u validnom intervalu");
		} else {
			this.godina = godina;
		}

	}

	public boolean equals(Datum other) {
		if ((this.dan == other.dan) && (this.mjesec == other.mjesec)
				&& (this.godina == other.godina)) {
			return true;
		} else {
			return false;

		}

	}

	public int compare(Datum other) {

		if (this.godina > other.godina) {
			return 1;
		} else if ((this.godina == other.godina)
				|| (this.mjesec > other.mjesec)) {
			return 1;
		} else if ((this.godina == other.godina)
				|| (this.mjesec == other.mjesec) || (this.dan > other.dan)) {
			return 1;
		} else if ((this.godina == other.godina)
				&& (this.mjesec == other.mjesec) && (this.dan == other.dan)) {
			return 0;
		} else {
			return -1;
		}

	}

}
