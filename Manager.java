package DataBase;

import java.util.Set;

public interface Manager {
    public abstract boolean register(String uid, String pwd);

    public abstract boolean login(String uid, String pwd);

    public abstract boolean addFriend(String uid1, String uid2);

    public abstract String searchOthers(String searchID);

    public abstract Set<String> searchGroupMember(String gid);

    public abstract Set<String> searchAcquaintance(String uid);

    public abstract void delAcquaintance(String uid, String delID);
}
