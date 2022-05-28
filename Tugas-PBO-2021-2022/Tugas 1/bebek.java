class bebek {
	private static String jenis_unggas = "bebek";
	private static int jumlah_kaki = 2;
	public static String getJenisUnggas() {
		return jenis_unggas;
	}
	
	public static int getJumlahKaki() {
		return jumlah_kaki;
	}
	
	private static void wekwekwek() {
		System.out.println("Aku bersuara   wekwekwek");
	}
	
	private static void berlari() {
		System.out.println("Aku berlari");
	}
	private static void bertelur() {
		System.out.println("Aku bertelur");
	}
	private static void berbulu() {
		System.out.println("Aku berbulu");
	}
	public static void main(String [] args) {
		System.out.println(
			String.format("Jenis unggas: %s",  getJenisUnggas())
		);
		System.out.println(
			String.format("Jumlah kaki: %s",  getJumlahKaki())
		);
		wekwekwek();
		berlari();
		bertelur();
		berbulu();
	}
}
