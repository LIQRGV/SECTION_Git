package srv.btp.eticket;

import android.app.Activity;

public class FormObjectTransfer {
	/*
	 * Kelas ini bertujuan untuk sentral tukar informasi antar Activity agar tidak
	 * ada activity yang saling lempar data secara direct.
	 */
	public static Activity last_activity;
	public static Activity current_activity;
	public static Form_Main main_activity;
	public static CharSequence Kota1, Kota2;
	public static int qty, harga, total;
	
	public static int CURRENT_STATE;
	/***
	 * Daftar STATE :
	 * 0 - 
	 * 1 - 
	 * 2 - 
	 * 3 - 
	 * 4 - 
	 * 
	 */
	
	
}
