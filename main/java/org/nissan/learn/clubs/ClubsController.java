package org.nissan.learn.clubs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClubsController {
    @Autowired
    private ClubsService clubService;

    @RequestMapping(method = RequestMethod.GET, value = "/clubs")
    public List<Clubs> GetClubs()
    {
        return clubService.getAllClubs();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/clubs/{name}")
    public ClubOutputDTO getClub(@PathVariable String name) {
        return clubService.getClub(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/clubs")
    public void addClub(@RequestBody Clubs clubs)
    {
   clubService.addClub(clubs);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/clubs/{name}")
    public void addClub(@RequestBody Clubs clubs,@PathVariable String name)
    {
        clubService.updateClub(name,clubs);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/clubs/{name}")
    public void deleteClub(@PathVariable String name)
    {
        clubService.deleteClub(name);
    }
}
