package ru.gur.archstoplist.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gur.archstoplist.entity.StopList;

import java.util.UUID;

@Repository
public interface StopListRepository extends JpaRepository<StopList, UUID> {
}
