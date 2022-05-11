package cuentaBancaria;

import java.time.LocalDate;

public class Cuenta {
	private Titular titular;
	private String nCuenta;
	private LocalDate fecha;
	private Double saldo;
	
	public Cuenta(Titular titular, String nCuenta, LocalDate fecha, Double saldo) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.fecha = fecha;
		this.saldo = saldo;
	}

	public Cuenta(Titular titular, String nCuenta, Double saldo) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.setSaldo(saldo);
		this.fecha = LocalDate.now();
	}

	public Cuenta(Titular titular, String nCuenta, Double saldo, int d, int m, int a) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.setSaldo(saldo);
		this.fecha = LocalDate.of(a, m, d);
	}

	public Cuenta(String nCuenta, Titular titular) {
		this(titular, nCuenta, 0d);
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingreso(double importe) {
		this.saldo += importe;

	}

	private double reintegro(double importe) {
		if (this.saldo >= importe)
			this.saldo -= importe;
		else
			importe = 0;
		return importe;

	}

	public boolean transferencia(double importe, Cuenta destino) {
		double tr;
		tr = this.reintegro(importe);
		if (tr > 0)
			destino.ingreso(tr);
		else
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", nCuenta=" + nCuenta + ", fecha=" + fecha + ", saldo=" + saldo + "]";
	}

}
