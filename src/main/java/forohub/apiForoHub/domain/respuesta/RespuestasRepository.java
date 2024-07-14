package forohub.apiForoHub.domain.respuesta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestasRepository extends JpaRepository<Respuesta, Long> {

    void removeByTopicId(Long id);
}
