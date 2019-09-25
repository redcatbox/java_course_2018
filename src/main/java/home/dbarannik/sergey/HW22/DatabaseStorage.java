package home.dbarannik.sergey.HW22;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import home.dbarannik.sergey.HW21.Storage;
import home.dbarannik.sergey.HW21.User;

public class DatabaseStorage implements Storage {

    private Integer startUserId;
    private Integer lastUserId;
    private Map storage;
    private File file;

    public DatabaseStorage(String fileName) {
        this.startUserId = -1;
        this.lastUserId = startUserId;
        this.storage = new TreeMap();
        this.file = new File("target/" + fileName);
    }

    private void DumpStorage() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, storage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer createUserId() {
        return lastUserId += 1;
    }

    @Override
    public void addUser(User user) {
        if (storage.containsValue(user)) {
            System.out.println("User " + user.getName() + " already exist!");
        } else {
            user.setId(createUserId());
            storage.put(user.getId(), user);
            DumpStorage();
        }
    }

    @Override
    public void updateUser(User user) {
        if (storage.containsValue(user)) {
            Set<Map.Entry<Integer, User>> entrySet = storage.entrySet();
            for (Map.Entry<Integer, User> entry : entrySet) {
                if (entry.getValue().equals(user)) {
                    entry.setValue(user);
                    break;
                }
            }
            DumpStorage();
        } else {
            System.out.println("User " + user.getName() + " was not found!");
        }
    }

    @Override
    public User getUser(int id) {
        User user = (User) storage.get(id);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        ArrayList<User> usersList = new ArrayList<>(storage.values());
        return usersList;
    }

    @Override
    public void removeUser(int id) {
        storage.remove(id);
        DumpStorage();
    }

    @Override
    public void removeUserByName(String name) {
        User user = new User(name, 0);
        if (storage.containsValue(user)) {
            Set<Map.Entry<Integer, User>> entrySet = storage.entrySet();
            for (Map.Entry<Integer, User> entry : entrySet) {
                if (entry.getValue().equals(user)) {
                    storage.remove(entry.getKey());
                    break;
                }
            }
            DumpStorage();
        } else {
            System.out.println("User " + name + " was not found!");
        }
    }

    @Override
    public void removeAll() {
        storage.clear();
        DumpStorage();
    }
}