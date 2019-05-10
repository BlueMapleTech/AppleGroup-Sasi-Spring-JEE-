package com.bluemaple.ticketbooking;

public class ReservationStatus {
	
	private int reservation_status_id;
	private String reservation_status;
	public int getReservation_status_id() {
		return reservation_status_id;
	}
	public void setReservation_status_id(int reservation_status_id) {
		this.reservation_status_id = reservation_status_id;
	}
	public String getReservation_status() {
		return reservation_status;
	}
	public void setReservation_status(String reservation_status) {
		this.reservation_status = reservation_status;
	}
	@Override
	public String toString() {
		return "ReservationStatus [reservation_status_id=" + reservation_status_id + ", reservation_status="
				+ reservation_status + "]";
	}
	
	

}
