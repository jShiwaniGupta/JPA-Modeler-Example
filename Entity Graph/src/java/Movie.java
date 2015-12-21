
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE_ENTITY_GRAPH")
@NamedQueries({@NamedQuery(name="Movie.findAll",query="SELECT m FROM Movie m"),@NamedQuery(name="Movie.findAllById",query="SELECT m FROM Movie m WHERE m.id = :movieId"),@NamedQuery(name="Movie.findAllByIds",query="SELECT m FROM Movie m WHERE m.id IN :movieIds")})
@NamedEntityGraphs({@NamedEntityGraph(name="movieWithActors",attributeNodes={@NamedAttributeNode(value="movieActors")}),@NamedEntityGraph(name="movieWithActorsAndAwards",attributeNodes={@NamedAttributeNode(value="movieActors",subgraph ="movieActorsGraph")},subgraphs={@NamedSubgraph(name="movieActorsGraph",attributeNodes={@NamedAttributeNode(value="movieActorAwards")})})})



public class Movie implements Serializable {

    @OneToMany(targetEntity = MovieActor.class)
    @JoinColumn(name="ID")
    private Set<MovieActor> movieActors;

    @Basic
    private String name;

    @Id
    private Integer id;

    @OneToMany(fetch = FetchType.EAGER,targetEntity = MovieDirector.class)
    @JoinColumn(name="ID")
    private Set<MovieDirector> movieDirectors;

    @OneToMany(targetEntity = MovieAward.class)
    @JoinColumn(name="ID")
    private Set<MovieAward> movieAwards;

    public Movie() {

    }
   
    public Set<MovieActor> getMovieActors() {
        return this.movieActors;
    }

    public void setMovieActors(Set<MovieActor> movieActors) {
        this.movieActors = movieActors;
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   
    public Set<MovieDirector> getMovieDirectors() {
        return this.movieDirectors;
    }

    public void setMovieDirectors(Set<MovieDirector> movieDirectors) {
        this.movieDirectors = movieDirectors;
    }
   
    public Set<MovieAward> getMovieAwards() {
        return this.movieAwards;
    }

    public void setMovieAwards(Set<MovieAward> movieAwards) {
        this.movieAwards = movieAwards;
    }
}
