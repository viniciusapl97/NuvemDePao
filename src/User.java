public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private Role role;

    public User (int id, String name, String email, String password, Role role){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    //Getters
    public int getId(){ return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Role getRole() { return role; }

    //Setters
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) {

        if (password == null || password.length() < 6) {
            System.out.println("Senha inválida. Insira uma senha com mais de 6 caracteres.");
            return;
        };

        this.password = password;

    }

    //Pra segurança é feito apenas um check se a senha está certa ou não
    public boolean checkPassword(String input) {
        return this.password.equals(input);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "', role=" + role + "}";
    }

}
