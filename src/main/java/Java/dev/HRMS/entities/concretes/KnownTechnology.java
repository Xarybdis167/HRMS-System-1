package Java.dev.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="known_technologies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class KnownTechnology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="known_technology_id")
	private int knownTechnologyId;
	
	@Column(name="technology_name")
	private String technologyName;
	
	@JsonIgnore
	@OneToMany(mappedBy="knownTechnology")
	private List<CV> cv;
}
