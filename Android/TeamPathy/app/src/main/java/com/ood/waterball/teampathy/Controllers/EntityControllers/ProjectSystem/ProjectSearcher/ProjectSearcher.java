package com.ood.waterball.teampathy.Controllers.EntityControllers.ProjectSystem.ProjectSearcher;


import com.ood.waterball.teampathy.DomainModels.Domains.Project;

import java.util.List;

public interface ProjectSearcher {
    List<Project> searchProject(String keyword) throws Exception;
}
