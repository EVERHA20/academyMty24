package com.curso.v3;

import java.util.Date;

public class Tarea {
	
	private final long id;
    private String tarea = "";
    private String descripcion = ""; 
    private String definidaPor = ""; 
    private String asignadaA = ""; //Opcional
    private boolean hecho = false;
    private Date fechaLimite = new Date();
    
    private Tarea(long id, String tarea, String descripcion, String definidaPor, String asignadaA, boolean hecho,
			Date fechaLimite) {
		super();
		this.id = id;
		this.tarea = tarea;
		this.descripcion = descripcion;
		this.definidaPor = definidaPor;
		this.asignadaA = asignadaA;
		this.hecho = hecho;
		this.fechaLimite = fechaLimite;
	}
	
	public long getId() {
		return id;
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDefinidaPor() {
		return definidaPor;
	}

	public void setDefinidaPor(String definidaPor) {
		this.definidaPor = definidaPor;
	}

	public String getAsignadaA() {
		return asignadaA;
	}

	public void setAsignadaA(String asignadaA) {
		this.asignadaA = asignadaA;
	}

	public boolean isHecho() {
		return hecho;
	}

	public void setHecho(boolean hecho) {
		this.hecho = hecho;
	}
	
	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", tarea=" + tarea + ", descripcion=" + descripcion + ", definidaPor=" + definidaPor
				+ ", asignadaA=" + asignadaA + ", hecho=" + hecho + ", fechaLimite=" + fechaLimite + "]";
	}
	
	public static class TareaBuilder {
		
		static private long id;
	    static private String tarea = "";
	    static private String descripcion = ""; 
	    static private String definidaPor = ""; 
	    static private String asignadaA = ""; 
	    static private boolean hecho = false;
	    static private Date fechaLimite = new Date();
	    
	    public static void setId(long id) {
			TareaBuilder.id = id;
		}

		public static void setTarea(String tarea) {
			TareaBuilder.tarea = tarea;
		}

		public static void setDescripcion(String descripcion) {
			TareaBuilder.descripcion = descripcion;
		}

		public static void setDefinidaPor(String definidaPor) {
			TareaBuilder.definidaPor = definidaPor;
		}

		public static void setAsignadaA(String asignadaA) {
			TareaBuilder.asignadaA = asignadaA;
		}

		public static void setHecho(boolean hecho) {
			TareaBuilder.hecho = hecho;
		}

		public static void setFechaLimite(Date fechaLimite) {
			TareaBuilder.fechaLimite = fechaLimite;
		}
		
		public static Tarea build() {
			return new Tarea(id,tarea,descripcion, definidaPor,
					asignadaA,hecho,fechaLimite);
		}

	}

	
}
