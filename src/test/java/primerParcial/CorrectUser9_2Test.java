package primerParcial;


import org.mockito.Mockito;

public class CorrectUser9_2Test {

    CorrectUser9_2 mock = Mockito.mock(CorrectUser9_2.class);

    public void verifyTest(String u , String pss, boolean  ,String expctedResult){
        Mockito.when(mock.verify(u,pss)).thenReturn();
    }

}
