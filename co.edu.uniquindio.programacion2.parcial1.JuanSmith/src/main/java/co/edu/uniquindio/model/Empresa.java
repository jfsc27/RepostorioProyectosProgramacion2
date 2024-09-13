package co.edu.uniquindio.model;

import co.edu.uniquindio.services.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements ICrudDepartamento, ICrudProyecto, ICrudTecnico, ICrudGerente, ICrudPresupuesto {

    private String nombre;
    private List<Empleado> listaEmpleados = new ArrayList<Empleado>();
    private List<Departamento> listaDepartamentos = new ArrayList<Departamento>();
    private List<Proyecto> listaProyectos = new ArrayList<Proyecto>();
    private List<Presupuesto> listaPresupuestos = new ArrayList<Presupuesto>();


    public List<Presupuesto> getListaPresupuestos() {
        return listaPresupuestos;
    }

    public void setListaPresupuestos(List<Presupuesto> listaPresupuestos) {
        this.listaPresupuestos = listaPresupuestos;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public <T> void agregarAutomaticamente(T objeto) {
        if (objeto instanceof Empleado) {
            listaEmpleados.add((Empleado) objeto);
        } else if (objeto instanceof Departamento) {
            listaDepartamentos.add((Departamento) objeto);
        } else if (objeto instanceof Proyecto) {
            listaProyectos.add((Proyecto) objeto);
        } else if (objeto instanceof Presupuesto) {
            listaPresupuestos.add((Presupuesto) objeto);
        }
    }

    @Override
    public boolean crearDepartamento(String nombre, String codigo) {
        if (!verificarDepartamentoRepetido(nombre)) {
            Departamento departamento = Departamento.builder().nombre(nombre).codigo(codigo).build();
            listaDepartamentos.add(departamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarDepartamento(String codigo) {
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                listaDepartamentos.remove(departamento);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarDepartamento(String nombre, String codigo, String codigoBuscar) {
        boolean estado = false;
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                departamento.setNombre(nombre);
                departamento.setCodigo(codigo);
                estado = true;
            }
        }
        return estado;
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                return departamento;
            }
        }
        return null;
    }

    @Override
    public List<Departamento> getDepartamentos() {
        if (listaDepartamentos.size() > 0) {
            return listaDepartamentos;
        } else {
            return null;
        }
    }


    @Override
    public boolean crearProyecto(String nombre, String codigo) {
        if (!verificarProyectoRepetido(nombre)) {
            Proyecto proyecto = Proyecto.builder().nombre(nombre).codigo(codigo).build();
            listaProyectos.add(proyecto);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarProyecto(String codigo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getCodigo().equals(codigo)) {
                listaProyectos.remove(proyecto);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para actualizar un proyecto dado su codigo de busqueda
     *
     * @param nombre
     * @param codigo
     * @return
     */
    @Override
    public boolean actualizarProyecto(String nombre, String codigo, String codigoBuscar) {
        boolean estado = false;
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getCodigo().equals(codigoBuscar)) {
                proyecto.setNombre(nombre);
                proyecto.setCodigo(codigo);
                estado = true;
            }
        }
        return estado;
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getCodigo().equals(codigo)) {
                return proyecto;
            }
        }
        return null;
    }

    @Override
    public List<Proyecto> getProyectos() {
        if (listaProyectos.size() > 0) {
            return listaProyectos;
        } else {
            return null;
        }
    }


    @Override
    public boolean crearGerente(String nombre, String id) {
        if (!verificarGerenteRepetido(nombre)) {
            Gerente gerente = Gerente.builder().nombre(nombre).id(id).build();
            listaEmpleados.add(gerente);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarGerente(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente) {
                if (empleado.getId().equals(id)) {
                    listaEmpleados.remove(empleado);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarGerente(String nombre, String id, String idBuscar) {
        boolean estado = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente) {
                if (empleado.getId().equals(idBuscar)) {
                    empleado.setNombre(nombre);
                    empleado.setId(id);
                    estado = true;
                }
            }
        }
        return estado;
    }

    @Override
    public Gerente getGerente(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente) {
                if (empleado.getId().equals(id)) {
                    return (Gerente) empleado;
                }
            }
        }
        return null;
    }

    @Override
    public List<Gerente> getGerentes(String nombre) {
        List<Gerente> gerentes = new ArrayList<Gerente>();
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente) {
                gerentes.add((Gerente) empleado);
            }
        }
        return gerentes;
    }

    @Override
    public boolean crearTecnico(String nombre, String id) {
        if (!verificarTecnicoRepetido(nombre)) {
            Tecnico tecnico = Tecnico.builder().nombre(nombre).id(id).build();
            listaEmpleados.add(tecnico);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarTecnico(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico) {
                if (empleado.getId().equals(id)) {
                    listaEmpleados.remove(empleado);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarTecnico(String nombre, String id, String idBuscar) {
        boolean estado = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico) {
                if (empleado.getId().equals(idBuscar)) {
                    empleado.setNombre(nombre);
                    empleado.setId(id);
                    estado = true;
                }
            }
        }
        return estado;
    }

    @Override
    public Tecnico getTecnico(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico) {
                if (empleado.getId().equals(id)) {
                    return (Tecnico) empleado;
                }
            }
        }
        return null;
    }

    @Override
    public List<Tecnico> getTecnicos(String nombre) {
        List<Tecnico> tecnicos = new ArrayList<Tecnico>();
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico) {
                tecnicos.add((Tecnico) empleado);
            }
        }
        return tecnicos;
    }

    private boolean verificarDepartamentoRepetido(String nombre) {
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarProyectoRepetido(String nombre) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarTecnicoRepetido(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Tecnico) {
                if (empleado.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean verificarGerenteRepetido(String id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Gerente) {
                if (empleado.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean verificarPresupuestoRepetido(String idPresupuesto) {
        for (Presupuesto presupuesto : listaPresupuestos) {
            if (presupuesto.getIdPresupuesto().equals(idPresupuesto)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean crearPresupuesto(String idPresupuesto, Double valor, String estado, String descripcion) {
        if (!verificarPresupuestoRepetido(idPresupuesto)) {
            Presupuesto presupuesto = Presupuesto.builder().idPresupuesto(idPresupuesto).valor(valor).estado(estado).descripcion(descripcion).build();
            listaPresupuestos.add(presupuesto);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarPresupuesto(String idPresupuesto) {
        for (Presupuesto presupuesto : listaPresupuestos) {
            if (presupuesto.getIdPresupuesto().equals(idPresupuesto)) {
                listaPresupuestos.remove(presupuesto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarPresupuesto(String idPresupuesto, Double valor, String estado, String descripcion, String codigoBuscar) {
        boolean actualizacion = false;
        for (Presupuesto presupuesto : listaPresupuestos) {
            if (presupuesto.getIdPresupuesto().equals(codigoBuscar)) {
                presupuesto.setIdPresupuesto(idPresupuesto);
                presupuesto.setValor(valor);
                presupuesto.setEstado(estado);
                presupuesto.setDescripcion(descripcion);

                actualizacion = true;
            }
        }
        return actualizacion;
    }

    @Override
    public Presupuesto getPresupuesto(String idPresupuesto) {
        for (Presupuesto presupuesto : listaPresupuestos) {
            if (presupuesto.getIdPresupuesto().equals(idPresupuesto)) {
                return presupuesto;
            }
        }
        return null;
    }

    @Override
    public List<Presupuesto> getPresupuestos() {
        if (listaPresupuestos.size() > 0) {
            return listaPresupuestos;
        } else {
            return null;
        }
    }
}