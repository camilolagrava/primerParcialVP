package primerParcial;

public class CorrectUser9_2 {

    UserVerify v;
    UserPermisos p;
    public CorrectUser9_2(){
        v = new UserVerify();
        p = new UserPermisos();
    }

    public String verify(String u, String pss){

        String m = "";

        if(v.verify(u,pss)){
            m = p.permisos(u,pss);
        }else{
            m = " Incorrect USER and PWD";
        }

        return m;
    }

}
