public class ClienteTest {

	public void testClienteConstructorAndGetters(){
		System.out.println("============= Test unitarias en cliente =============");
		System.out.println(cliente.toString());
	}

	@Test
	public void testClienteSetters(){
		cliente.setIdCliente(2);
		cliente.setCedula("1701234568");
		cliente.setNombre("Juan3");
		cliente.setApellido("Taipe3");
		cliente.setDireccion("Av. por ahi. 3.");
		cliente.setTelefono("0987654323");
		cliente.setCorreo("jtaipe3@correo.com");

		assertAll("Validar datos del cliente con Setters",
				() -> assertEquals(2, cliente.getIdCliente()),
				() -> assertEquals("1701234568", cliente.getCedula()),
				() -> assertEquals("Juan3", cliente.getNombre()),
				() -> assertEquals("Taipe3", cliente.getApellido()),
				() -> assertEquals("Av. por ahi. 3.", cliente.getDireccion()),
				() -> assertEquals("0987654323", cliente.getTelefono()),
				() -> assertEquals("jtaipe3@correo.com", cliente.getCorreo())
		);
	}

	@Test
	public void testClienteToString(){
		String str = cliente.toString();
		assertAll("Validad datos de cliente con toString",
				() -> assertTrue(str.contains("1")),
				() -> assertTrue(str.contains("1701234567")),