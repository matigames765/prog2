package ejAgregacion;
import java.util.ArrayList;
public class Empresa {

    private ArrayList<Departamento> departamentos;

    public Empresa() {
    }

    public Empresa(ArrayList<Departamento> departamentos) {
        this.departamentos = new ArrayList<>();
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
}
