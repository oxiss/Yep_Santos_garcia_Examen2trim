package es.santosgarcia.yep;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;


public class ApplicationTest extends ActivityInstrumentationTestCase2<Login> {
    private Button boton;
    private Login actividad;


    public ApplicationTest() {
        super(Login.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        boton = (Button) actividad.findViewById(R.id.buttonlogin);


    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }


    private static final boolean RESULT = true;

    public void testAddValues() {

        TouchUtils.clickView(this, boton);


       // assertTrue("Add result should be...", getCurrentUser().equals(loginresult));
    }


}