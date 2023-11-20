package es.ieslosmontecillos.AppAgendaDK.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;
import java.util.Collection;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;

    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;

    @Column(name = "TELEFONO", length = 15, nullable = true)
    private String telefono;

    @Column(name = "EMAIL", length = 30, nullable = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "PROVINCIA", nullable = false)
    private Provincia provincia;

    @Column(name = "FECHA_NACIMIENTO", nullable = true)
    private java.sql.Date fechaNacimiento;

    @Column(name = "NUM_HIJOS", nullable = true)
    private Short numHijos;

    @Column(name = "ESTADO_CIVIL", length = 1, nullable = true)
    private Character estadoCivil;

    @Column(name = "SALARIO", precision = 9, scale = 2, nullable = true)
    private java.math.BigDecimal salario;

    @Column(name = "JUBILADO", nullable = true)
    private Integer jubilado;

    @Column(name = "FOTO", length = 30, nullable = true)
    private String foto;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Short getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(Short numHijos) {
        this.numHijos = numHijos;
    }

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public java.math.BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(java.math.BigDecimal salario) {
        this.salario = salario;
    }

    public Integer isJubilado() {
        return jubilado;
    }

    public void setJubilado(Integer jubilado) {
        this.jubilado = jubilado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id) && Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos);
    }
}
