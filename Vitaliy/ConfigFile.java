import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ConfigFile implements Externalizable {

	private String nickname;
	private String password;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(this.nickname);
		out.writeObject(this.password);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.nickname = (String) in.readObject();
		this.password = (String) in.readObject();
	}
	@Override
	public String toString () {
		return "User [nickname= " + nickname +"password=" + password + "]";
	}
		
}
