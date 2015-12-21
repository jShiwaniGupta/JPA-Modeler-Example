
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_ACTORS_ENTITY_GRAPH")

public class MovieActor implements Serializable {

    @Basic
    private String actor;

    @Id
    private Integer id;

    @OneToMany(targetEntity = MovieActorAward.class)
    @JoinColumn(name = "ID")
    private Set<MovieActorAward> movieActorAwards;

    public MovieActor() {

    }

    public String getActor() {
        return this.actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<MovieActorAward> getMovieActorAwards() {
        return this.movieActorAwards;
    }

    public void setMovieActorAwards(Set<MovieActorAward> movieActorAwards) {
        this.movieActorAwards = movieActorAwards;
    }
}
