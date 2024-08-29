import java.util.Optional;

class kullanıcı {
    private String name;
    private String email;

    public kullanıcı(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
