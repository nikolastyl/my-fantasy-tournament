package com.fantasy.fantasy_tournament.service.user;

import com.fantasy.fantasy_tournament.domain.user.User;
import com.fantasy.fantasy_tournament.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    /*
     * Constructor Injection μέσω Lombok.
     *
     * Η Spring θα βρει το UserRepository
     * και θα το δώσει αυτόματα εδώ.
     */
    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}