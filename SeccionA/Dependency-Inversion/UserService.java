/**
 * UserService
 */
class User{
    // definicion de User
}

interface IUserRepository{
    User getUserById(int id);
    void saveUser(User user);
}

class UserRepository implements IUserRepository{

	@Override
	public User getUserById(int id) {
        // lógica para obtener un usuario por ID desde la base de datos
        return new User();
	}

	@Override
	public void saveUser(User user) {
        // lógica para guardar un usuario en la base de datos
	}
}

class UserService{
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User findUserById(int id){
        return userRepository.getUserById(id);
    }

    public void saveUser(User user){
        userRepository.saveUser(user);
    }
}
