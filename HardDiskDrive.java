package cloud;

import cloud.exceptions.CloudGenericException;

public class HardDiskDrive {
	String id;						// Identificador único
	long capacityGB;				// Capacidad en GB
	int unitNumber;                 // Número de unidad
	String label;	                // Etiqueta
	
	private static final int MIN_CAPACITY = 1;
	private static final int CAPACITY_MULTIPLE = 40;

	/* 
	 * HardDiskDrive[1]
	 * Crear constructor y validar lo siguiente:
	 * - capacityGB debe ser mayor a 0 y múltiplo de 40
	 * HardDiskDrive[2]
	 * Reemplazar concatenación de strings 
	 * usando "+" por StringBuilder en Constructores 
	 */
	public HardDiskDrive(long capacityGB, int unitNumber) throws CloudGenericException {
		this.unitNumber = unitNumber;
		// Escribe tu código {
		if ( capacityGB < MIN_CAPACITY ) {
			throw new CloudGenericException("La capacidad minima es " + MIN_CAPACITY);
		}
		this.capacityGB = capacityGB;

		if ( capacityGB % CAPACITY_MULTIPLE != 0 ) {
			throw new CloudGenericException("La capacidad debe ser múltiplo de: " + CAPACITY_MULTIPLE);	
		}

		StringBuilder sb = new StringBuilder();
		this.label = sb.append("Hard Disk ").append(unitNumber).toString();
		// }
	}
	
	/*
	 * HardDiskDrive[3]
	 * Sobrecargar el método 
	 * java.lang.Object.toString() para mostrar la 
	 * representación en String de HardDiskDrive
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		// Escribe tu código {
		sb.append("Etiqueta : ").append(this.label).append("\n");
		sb.append("Unidad   : ").append(this.unitNumber).append("\n");
		sb.append("Capacidad: ").append(this.capacityGB).append("\n");
		// }
		return sb.toString();
	}
}

