package org.generation.util;

public class Consultor implements Pagable{
		private String razonSocial;
		private String RFC;
		private double costoHora;
		
		public Consultor(String razonSocial, String rFC, double costoHora) {
			super();
			this.razonSocial = razonSocial;
			RFC = rFC;
			this.costoHora = costoHora;
		}//constructor

		public String getRazonSocial() {
			return razonSocial;
		}//getRazonSocial

		public void setRazonSocial(String razonSocial) {
			this.razonSocial = razonSocial;
		}//setRazonSocial

		public String getRFC() {
			return RFC;
		}//getRFC

		public void setRFC(String rFC) {
			RFC = rFC;
		}//setRFC

		public double getCostoHora() {
			return costoHora;
		}//getCostoHora

		public void setCostoHora(double costoHora) {
			this.costoHora = costoHora;
		}//setCostoHora

		@Override
		public String toString() {
			return "Consultor [razonSocial=" + razonSocial + ", RFC=" + RFC + ", costoHora=" + costoHora + "]";
		}//toString

		@Override
		public String getName() {
			return getRazonSocial();
		}//getName

		@Override
		public double calculateSalary(int d) {
			return ((d*8)*this.costoHora)*1.16;
		}//calculateSalary


		
		
		
		
		
		
}//class
