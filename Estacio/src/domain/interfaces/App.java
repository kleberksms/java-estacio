/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.interfaces;

import java.util.List;

/**
 *
 * @author kleberksms
 * @param <Entity>
 */
public interface App<Entity> {
    List<Entity> Lista();
    void CompletaFrare(Entity obj);
}
