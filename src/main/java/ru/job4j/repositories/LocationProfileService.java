package ru.job4j.repositories;


import ru.job4j.models.Location;

import java.util.List;

public interface LocationProfileService {
    List<Location> findByFullnameLike(String fullname);

    Location save(Location location);
    void update(Location location);
}
