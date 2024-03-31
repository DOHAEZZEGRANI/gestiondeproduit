package org.xproce.myproject.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.myproject.dao.entities.Command;

public interface CommadRepository extends JpaRepository<Command,Integer> {
}
