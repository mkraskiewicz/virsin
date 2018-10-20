package com.mkraskiewicz.bootstrap;

import com.mkraskiewicz.domain.Authority;
import com.mkraskiewicz.domain.Item;
import com.mkraskiewicz.domain.Player;
import com.mkraskiewicz.domain.User;
import com.mkraskiewicz.domain.enumeration.ItemType;
import com.mkraskiewicz.repository.AuthorityRepository;
import com.mkraskiewicz.repository.ItemRepository;
import com.mkraskiewicz.repository.PlayerRepository;
import com.mkraskiewicz.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Maciej on 19/10/2018
 */
@Component
public class VirsinBootstrap implements CommandLineRunner {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthorityRepository authorityRepository;
    private final ItemRepository itemRepository;
    private final PlayerRepository playerRepository;


    public VirsinBootstrap(UserRepository userRepository, PasswordEncoder passwordEncoder, AuthorityRepository authorityRepository, ItemRepository itemRepository, PlayerRepository playerRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authorityRepository = authorityRepository;
        this.itemRepository = itemRepository;
        this.playerRepository = playerRepository;
    }

    @Transactional
    @Override
    public void run(String... strings) throws Exception {


            initData();


    }

    private void initData() {
        User user = new User();
        user.setFirstName("Johnny");
        user.setPassword(passwordEncoder.encode("johny"));
        user.setLogin("johny");
        user.setEmail("johnny@runningforbrews.com");
        user.setActivated(true);
        user.addAuthority(authorityRepository.findByName("ROLE_USER").get());




        userRepository.save(user);
        Player player1 = new Player();
        player1.setCondition(5);
        player1.setDexterity(5);
        player1.setGold(20);
        player1.setLuck(5);
        player1.setStrength(5);
        player1.setUser(user);
        player1.setLevel(1);
        player1.setExperience(100);
        playerRepository.save(player1);

        Item sword = new Item();
        sword.setStrBonus(2);
        sword.setMinDmg(2);
        sword.setMaxDmg(5);
        sword.setName("Sword");
        sword.setType(ItemType.Weapon);
        sword.setPlayer(player1);
        itemRepository.save(sword);



    }






}
